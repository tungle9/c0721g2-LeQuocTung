import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {User} from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private API_URL = 'http://localhost:3000/user';

  constructor(private httpClient: HttpClient) {
  }

  getAllUser() {
    return this.httpClient.get<User[]>(this.API_URL);
  }

}
