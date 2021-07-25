import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-list-person',
  templateUrl: './list-person.component.html',
  styleUrls: ['./list-person.component.css']
})
export class ListPersonComponent implements OnInit {
  arrPeople = [
    {name: 'nam', age: '11'},
    {name: 'tuan', age: '12'},
    {name: 'thuy', age: '17'}
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

  removeByName(name: string) {
    const index = this.arrPeople.findIndex(e => e.name = name);
    this.arrPeople.splice(index, 1);

  }
}
