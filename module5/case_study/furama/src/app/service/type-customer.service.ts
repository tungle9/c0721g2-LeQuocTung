import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {TypeCustomer} from '../model/type-customer';

@Injectable({
  providedIn: 'root'
})
export class TypeCustomerService {
  private URL_API = 'http://localhost:3000/customerType';

  constructor(public httpClient: HttpClient) {
  }

  getAllType() {
    return this.httpClient.get<TypeCustomer[]>(this.URL_API);
  }
}
