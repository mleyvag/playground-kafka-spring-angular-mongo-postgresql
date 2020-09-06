import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
//import { catchError, map, tap } from 'rxjs/operators';
//import { environment } from '../../environments/environment';


@Injectable({
  providedIn: 'root',
})
export class MessageService {

  //private heroesUrl = environment.apiUrl;

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };


  constructor(private http: HttpClient) { }

  sendMessageToTopicOne(message: string) : Observable<String> {
      console.log("sendMessageToTopicOne() from MessageService ... message: " + message);
      return this.http.get<String>("/send/topic1/" + message, this.httpOptions);
  }

  sendMessageToTopicTwo(message: string) : Observable<String> {
    console.log("sendMessageToTopicTwo() from MessageService ... message: " + message);
    return this.http.get<String>("/send/topic2/" + message, this.httpOptions);
}

  

}