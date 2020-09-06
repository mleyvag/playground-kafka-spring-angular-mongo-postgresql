import { Component } from '@angular/core';
import { MessageService } from './services/message.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title: string;
  message: string;
  output: string;
 
  constructor(private messageService: MessageService) {
    this.title = 'Spring Boot - Angular Application';
    this.message = '';
    this.output = '';
  }

  sendTopicOne() {
    console.log("sendTopicOne");
    this.messageService.sendMessageToTopicOne(this.message).subscribe(
      (data) => {
        console.info(data);
        this.output = data['status'];
      },
      (error) => {
        console.error(error)
      }
    );
  }

  sendTopicTwo() {
    console.log("sendTopicTwo");
    this.messageService.sendMessageToTopicTwo(this.message).subscribe(
      (data) => {
        console.info(data);
        this.output = data['status'];
      },
      (error) => {
        console.error(error)
      }
    );
  }

}
