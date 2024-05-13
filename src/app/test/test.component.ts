import { Component } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <h2>Welcome </h2>
  <button (click)="onClick($event)">Greet</button>
  {{greeting}}
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent {
  public siteUrl=window.location.href;
  onClick(event:any){
    console.log("hello") 
    console.log(event)
    this.greeting=event.type
  }
  public greeting=""
}
