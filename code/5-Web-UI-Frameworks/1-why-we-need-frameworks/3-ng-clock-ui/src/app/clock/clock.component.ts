import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-clock',
  templateUrl: './clock.component.html',
  styleUrls: ['./clock.component.css']
})
export class ClockComponent implements OnInit {

  @Input()
  timeZone="Asia/Kolkata";
  time=new Date().toLocaleTimeString()

  constructor() { }

  ngOnInit(): void {
    setInterval(()=>{
      this.time = new Date().toLocaleTimeString('en-US', {timeZone:this.timeZone})
    }, 1000);
  }

}
