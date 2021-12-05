import './index.scss'
import './componenets/clock';
import { Clock } from './componenets/clock';
import React from 'react';
import ReactDOM from 'react-dom';

console.log("-index.ts-");


//--------------------------------
// using DOM  & Timer API
//--------------------------------

// query DOM Elements
const clock1Ele = document.getElementById('clock1');
const clock2Ele = document.getElementById('clock2');
const clock3Ele = document.getElementById('clock3');

// bind event listeners & reactt on event 

setInterval(() => {

        ReactDOM.render(<Clock timeZone="America/New_york"/>, clock1Ele);
        ReactDOM.render(<Clock timeZone="Asia/Kolkata"/>, clock2Ele);
        ReactDOM.render(<Clock timeZone="Asia/Dubai"/>, clock3Ele);

}, 1000)