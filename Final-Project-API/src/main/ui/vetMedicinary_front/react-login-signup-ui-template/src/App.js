import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

import Login from "./components/login.component";
import SearchAnimal from './components/searchAnimal.componenet';
import UserProfile from "./components/userProfile.componenet";
import SearchMain from './components/searchMain.componenet';
import TeachingTechnician from './components/teachingTechnician.componenet';
import AdministratorAccess from './components/administratorAccess.componenet';
import AnimalCareAttendance from './components/animalCareAttendance.componenet'; 
import AnimalProfile from './components/animalProfile.component';
import AnimalHealthTechnician from './components/animalHealthTechnician.componenet'; 
import AnimalService from './service/AnimalService';


function App() {
  return (
  <Router>
    <div className="App">
      <nav className="navbar navbar-expand-lg navbar-light fixed-top">
        <div className="container">
          <div className="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul className="navbar-nav ml-auto">
              <li className="nav-item">
                <Link className="nav-link" to={"/Login"}>Login</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/SearchAnimal"}>SearchAnimal</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/AnimalProfile"}>AnimalProfile</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/UserProfile"}>Student Profile</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/TeachingTechnician"}>Teaching Technician</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/AdministratorAccess"}>Administrator Access</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/AnimalCareAttendance"}>Animal Care Attendance</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/AnimalHealthTechnician"}>Animal Health Technician</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
{/* 
      <div className="auth-wrapper">
        <div className="auth-inner"> */}
          <Switch>
            <Route exact path='/' component={Login} />
            <Route path="/Login" component={Login} />
            <Route path="/UserProfile" component={UserProfile} />
            <Route path="/SearchMain" component={SearchMain} />
            <Route path="/SearchAnimal" component={SearchAnimal} />
            <Route path="/AnimalProfile" component={AnimalProfile} />
            <Route path="/AdministratorAccess" component={AdministratorAccess} />
            <Route path="/TeachingTechnician" component={TeachingTechnician} />
            <Route path="/AnimalCareAttendance" component={AnimalCareAttendance}/>
            <Route path="/AnimalHealthTechnician" component={AnimalHealthTechnician}/>
          </Switch>
        {/* </div>
      </div> */}
    </div>
    </Router>
  );
}

export default App;