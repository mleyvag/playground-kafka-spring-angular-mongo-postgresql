import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from '../../environments/environment';


@Injectable({
  providedIn: 'root',
})
export class MessageService {

  private heroesUrl = environment.apiUrl;  // URL to web api

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };


  constructor(private http: HttpClient) { }

  sendMessage(message: string, topic: string) : Observable<String> {
      console.log("sendMessage() from MessageService ... message: " + message + " topic: " + topic);
      return this.http.get<String>(this.heroesUrl + topic + "/" + message, this.httpOptions);
  }

  



}