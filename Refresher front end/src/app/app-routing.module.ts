import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewprofileComponent } from './viewprofile/viewprofile.component';
import { OrderhistoryComponent } from './orderhistory/orderhistory.component';


const routes: Routes = [
  {path:'viewprofile',component:ViewprofileComponent},
  {path:'orderhistory',component:OrderhistoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
