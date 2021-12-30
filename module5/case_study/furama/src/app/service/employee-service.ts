import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Employee} from '../model/employee';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private API_URL = 'http://localhost:3000/employee';

  constructor(private httpClient: HttpClient) {
  }

  getAllEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.API_URL);
  }

  saveEmployee(employee: Employee): Observable<Employee> {
    return this.httpClient.post<Employee>(this.API_URL, employee);
  }

  getEmployeeById(id): Observable<any> {
    return this.httpClient.get(this.API_URL + '/' + id);
  }

  deleteEmployee(id: number): Observable<any> {
    return this.httpClient.delete(this.API_URL + '/' + id);
  }

  detail(item: Observable<Employee>): Observable<Employee> {
    return item = this.httpClient.get<Employee>(this.API_URL);
  }

  editEmployee(employee, id): Observable<any> {
    return this.httpClient.put(this.API_URL + '/' + id, employee);
  }

  // getEmployeeByIndex(index: number) {
  //   return this.employee[index];
  //
  // }
}
