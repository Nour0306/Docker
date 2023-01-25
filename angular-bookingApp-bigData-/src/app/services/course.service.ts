import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Tutorial } from '../model/Tutorial';

@Injectable({
  providedIn: 'root'
})

export class CourseService {
  constructor(
    private http: HttpClient
  ) { }

  loadCourses() {
    return this.http.get<Tutorial[]>('http://app:8080/tutorials');
  }
}
