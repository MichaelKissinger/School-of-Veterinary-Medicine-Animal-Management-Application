import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Login from "./components/login.component";

//Animal Profile
import AnimalProfile from './components/animalProfile/animalProfile.component';
import AnimalAddProblem from './components/animalProfile/AnimalAddProblems';
import AnimalAddHistory from './components/animalProfile/AnimalAddHistory';
import AnimalAddPrescription from './components/animalProfile/AnimalAddPrescription';

import SearchAnimal from './components/searchAnimal.componenet';
// import UserProfile from "./components/userProfile.componenet";
// import SearchMain from './components/searchMain.componenet';
// import TeachingTechnician from './components/teachingTechnician.componenet';
// import AdministratorAccess from './components/administratorAccess.componenet';
// import AnimalCareAttendance from './components/animalCareAttendance.componenet'; 
// import AnimalProfile from './components/animalProfile.component';
// import AnimalHealthTechnician from './components/animalHealthTechnician.componenet'; 
import AnimalService from './service/AnimalService';

// Admin
import AdminAnimalSearch from './components/admin/adminAnimalSearch.componenet';
import AdminUserList from './components/admin/adminUserList.componenet';
import AdminBlockedUserList from './components/admin/adminBlockedUserList.componenet';
import AdminAddUser from './components/admin/adminAddUser.componenet';
import AdminProfile from './components/admin/adminProfile.componenet';
// Animal Health Technician
import AnimalHealthTechnicianAnimalSearch from './components/animalHealthTechnician/animalHealthTechnicianAnimalSearch.componenet';
import AnimalHealthTechnicianProfile from './components/animalHealthTechnician/animalHealthTechnicianProfile.componenet';
// Animal Care Attendance
import AnimalCareAttendanceAnimalSearch from './components/animalCareAttendance/animalCareAttendanceAnimalSearch.componenet';
import AnimalCareAttendanceAlertAnimal from './components/animalCareAttendance/animalCareAttendanceAlertAnimal.componenet';
import AnimalCareAttendanceRequestedTreatment from './components/animalCareAttendance/animalCareAttendanceRequestedTreatment.componenet.js';
import AnimalCareAttendanceProfile from './components/animalCareAttendance/animalCareAttendanceProfile.componenet';
// Teaching Technician
import TeachingTechnicianUserList from './components/teachingTechnician/teachingTechnicianUserList.componenet';
import TeachingTechnicianAnimalSearch from './components/teachingTechnician/teachingTechnicianAnimalSearch.componenet';
import TeachingTechnicianAddUser from './components/teachingTechnician/teachingTechnicianAddUser.componenet';
import TeachingTechnicianBlockedUserList from './components/teachingTechnician/teachingTechnicianBlockedUserList.componenet';
import TeachingTechnicianRequestedAnimal from './components/teachingTechnician/teachingTechnicianRequestedAnimal.componenet';
import TeachingTechnicianProfile from './components/teachingTechnician/teachingTechnicianProfile.componenet';
// Student
import StudentAnimalSearch from './components/student/studentAnimalSearch.componenet';
import StudentProfile from './components/student/studentProfile.componenet';


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
                  <Link className="nav-link" to={"/AnimalProfile/:id"}>AnimalProfile</Link>
                </li>
                {/* <li className="nav-item">
                <Link className="nav-link" to={"/UserProfile"}>Student Profile</Link>
              </li> */}
                {/* <li className="nav-item">
                <Link className="nav-link" to={"/TeachingTechnician"}>Teaching Technician</Link>
              </li> */}
                {/* <li className="nav-item">
                <Link className="nav-link" to={"/AdministratorAccess"}>Administrator Access</Link>
              </li> */}
                {/* <li className="nav-item">
                <Link className="nav-link" to={"/AnimalCareAttendance"}>Animal Care Attendance</Link>
              </li> */}
                {/* <li className="nav-item">
                <Link className="nav-link" to={"/AnimalHealthTechnician"}>Animal Health Technician</Link>
              </li> */}
                <li className="nav-item">
                  <Link className="nav-link" to={"/AdminAnimalSearch"}>Admin</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={"/AnimalHealthTechnicianAnimalSearch"}>Animal Health Technician</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={"/AnimalCareAttendanceAnimalSearch"}>Animal Care Attendance</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={"/TeachingTechnicianAnimalSearch"}>Teaching Technician</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to={"/StudentAnimalSearch"}>Student</Link>
                </li>
              </ul>
            </div>
          </div>
        </nav>
       
       <div className="auth-wrapper">
       <div className="auth-inner">
        <Switch>
          <Route exact path='/' component={Login} />
          <Route path="/Login" component={Login} />
          {/* <Route path="/UserProfile" component={UserProfile} /> */}
          {/* <Route path="/SearchMain" component={SearchMain} /> */}
          <Route path="/SearchAnimal" component={SearchAnimal} />


          {/* Animal Profile */}
          <Route path="/AnimalProfile/:id" component={AnimalProfile} />
          <Route path="/AnimalProblems/:id" component={AnimalAddProblem} />
          <Route path="/AnimalPrescriptions/:id" component={AnimalAddPrescription} />
          <Route path="/AnimalHistory/:id" component={AnimalAddHistory} />

          {/* <Route path="/AdministratorAccess" component={AdministratorAccess} />
            <Route path="/TeachingTechnician" component={TeachingTechnician} />
            <Route path="/AnimalCareAttendance" component={AnimalCareAttendance}/>
            <Route path="/AnimalHealthTechnician" component={AnimalHealthTechnician}/> */}

          {/* Admin */}
          <Route path="/AdminAnimalSearch" component={AdminAnimalSearch} />
          <Route path="/AdminUserList" component={AdminUserList} />
          <Route path="/AdminBlockedUserList" component={AdminBlockedUserList} />
          <Route path="/AdminAddUser" component={AdminAddUser} />
          <Route path="/AdminProfile" component={AdminProfile} />
          {/* Animal Health Technician */}
          <Route path="/AnimalHealthTechnicianAnimalSearch" component={AnimalHealthTechnicianAnimalSearch} />
          <Route path="/AnimalHealthTechnicianProfile" component={AnimalHealthTechnicianProfile} />
          {/* Animal Care  Attendance */}
          <Route path="/AnimalCareAttendanceAnimalSearch" component={AnimalCareAttendanceAnimalSearch} />
          <Route path="/AnimalCareAttendanceAlertAnimal" component={AnimalCareAttendanceAlertAnimal} />
          <Route path="/AnimalCareAttendanceProfile" component={AnimalCareAttendanceProfile} />
          <Route path="/AnimalCareAttendanceRequestedTreatment" component={AnimalCareAttendanceRequestedTreatment} />
          {/* Teaching Technician*/}
          <Route path="/TeachingTechnicianUserList" component={TeachingTechnicianUserList} />
          <Route path="/TeachingTechnicianAnimalSearch" component={TeachingTechnicianAnimalSearch} />
          <Route path="/TeachingTechnicianAddUser" component={TeachingTechnicianAddUser} />
          <Route path="/TeachingTechnicianBlockedUserList" component={TeachingTechnicianBlockedUserList} />
          <Route path="/TeachingTechnicianRequestedAnimal" component={TeachingTechnicianRequestedAnimal} />
          <Route path="/TeachingTechnicianProfile" component={TeachingTechnicianProfile} />
          {/* Student */}
          <Route path="/StudentAnimalSearch" component={StudentAnimalSearch} />
          <Route path="/StudentProfile" component={StudentProfile} />
        </Switch>
        </div>
      </div> 

      </div>
    </Router>
  );
}

export default App;