import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = "http://localhost:8081/employee/employees";

  constructor(private http: HttpClient) { }

    getEmployees(): Observable<Employee[]>{
      return this.http.get<Employee[]>(`${this.baseUrl}`);}
  
}
