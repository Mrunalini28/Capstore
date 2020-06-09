import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-viewprofile',
  templateUrl: './viewprofile.component.html',
  styleUrls: ['./viewprofile.component.css']
})
export class ViewprofileComponent implements OnInit {

  profileview: [];

  profiledata = {
    id:0,
    name: null,
    email: null,
    phoneNumber: null
  };

  updateprofile: any;
  message: any;
  statuscode;

  constructor(private customersevice: CustomerService) {
    this.viewProfile();
  }

  ngOnInit(): void {
  }

  viewProfile() {
    const profile = JSON.parse(localStorage.getItem('panel'));
    this.customersevice.viewprofile(profile).subscribe(data => {
      console.log(data);
      this.profiledata = data.loginbean;
    }, err => {
      console.log(err);
    });
  }


  selectCustomer(customer) {
    this.updateprofile = customer;
  }

  updateForm(updateCustomer: NgForm) {
    this.customersevice.updateProfile(updateCustomer.value).subscribe(data => {
      console.log(data);      
      this.message = data.description;
      this.statuscode = data.statusCode;
      if(data.statuscode === 200){
        updateCustomer.reset();
      }
    }, err => {
      console.log(err);
    });
  }
}
