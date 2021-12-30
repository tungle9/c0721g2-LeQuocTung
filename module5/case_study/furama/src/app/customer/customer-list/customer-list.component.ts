import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {Customer} from '../../model/customer';
import {Subscription} from 'rxjs';
import {TypeCustomer} from '../../model/type-customer';
import {TypeCustomerService} from '../../service/type-customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customer: Customer[] | undefined;
  typeCustomer: TypeCustomer[] | undefined;
  private subscription: Subscription;
  p: any;
  term: string;


  constructor(private customerService: CustomerService,
              private typeCustomerService: TypeCustomerService) {
  }

  ngOnInit(): void {
    this.subscription = this.customerService.getAllCustomer().subscribe(
      data => {
        this.customer = data;
      }, error => {
        console.log('error');
      }
    );
    this.subscription = this.typeCustomerService.getAllType().subscribe(
      data => {
        this.typeCustomer = data;
      }, error => {
        console.log('error');
      }
    );
  }
}
