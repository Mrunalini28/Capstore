import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-orderhistory',
  templateUrl: './orderhistory.component.html',
  styleUrls: ['./orderhistory.component.css']
})
export class OrderhistoryComponent implements OnInit {

  historydetails = [];
  orders = [];
  

  constructor(private history: CustomerService) {
    this.orderdetails();
    
  }

  orderdetails() {
    this.history.orderdetails().subscribe(data => {
      console.log(data.orderList);
      this.historydetails = data.orderList;
    },
      err => {
        console.log(err);
      })

  }
  ngOnInit(): void {
  }

}
