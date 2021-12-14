import React, { Component } from "react";
import { useHistory } from 'react-router-dom';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import axios from "axios";


const User_REST_API_URL = 'http://localhost:8080/studentlist';

const TeachingTechnicianStudentList = () => {

    const history = useHistory();
    const[myArray, setMyArray] = React.useState([]);
    const[ID1, setID1] = React.useState();
    const[ID2, setID2] = React.useState();
    const[changeStatus, setChangeStatus] = React.useState();
    const[name, setName] = React.useState('')
    const[searchId, setSearchId] = React.useState('');

    function handleLogout() {
        localStorage.clear();
        history.push("/Login");
    }
    // const statusText = useRef();

    const FName = localStorage.getItem('FName');
    const LName = localStorage.getItem('LName');

    React.useEffect(() => {
        axios.get(User_REST_API_URL).then(response => setMyArray(response.data));
    }, []);

    function removeStudent(e,id) {
        e.preventDefault();
        setChangeStatus("Removed");
        setID1(id);
        console.log(ID1);
        const status = { Status: changeStatus };
        // console.log(status);
        axios.put('http://localhost:8080/removestudent/' + ID1, status)
            .then();
    }

    function blockStudent(e,id) {
        e.preventDefault();
        setChangeStatus("Blocked");
        setID2(id);
        console.log(ID2);
        const status = { Status: changeStatus };
        // console.log(status);
        axios.put('http://localhost:8080/blockstudent/' + ID2, status)
            .then();
    }

    function handleSubmit(event){
        event.preventDefault();
        const sendData = {
            name: name,
            id: searchId,
        }

        axios.post('http://localhost:8080/searchStudent', sendData).then(response => setMyArray(response.data));
    }

    return (
        <form>
            <div className="container-fluid">
                <div className="row">
                    <nav className="col-md-2 d-none d-md-block bg-light sidebar">
                        <div className="sidebar-sticky">
                            <h7 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                <span><strong>Teaching Technician</strong></span>
                            </h7>
                            <ul className="nav flex-column">
                                <li className="nav-item">
                                    <div className="d-flex flex-column align-items-center text-center">
                                        <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="130" />
                                    </div>
                                </li>
                            </ul>
                            <h6 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1 text-muted">
                                <span><strong>{FName}  {LName}</strong></span>
                            </h6>

                            <ul style={{marginTop: 30}} className="nav flex-column mb-2">
                                <li className="nav-item">
                                    <Link style={{color: "black"}}  className="nav-link" to={"/TeachingTechnicianProfile"}>My Profile</Link>
                                </li>
                                <li className="nav-item">
                                    <Link style={{color: "black"}}  className="nav-link" to={"/TeachingTechnicianUserList"}>Student List</Link>
                                </li>
                                <li className="nav-item">
                                    <Link style={{color: "black"}}  className="nav-link" to={"/TeachingTechnicianBlockedUserList"}>Blocked Student List</Link>
                                </li>

                                <li className="nav-item">
                                    <Link style={{color: "black"}}  className="nav-link" to={"/TeachingTechnicianAnimalSearch"}>Animal List</Link>
                                </li>
                                <li className="nav-item">
                                    <Link style={{color: "black"}}  className="nav-link" to={"/TeachingTechnicianRequestedAnimal"}>Requested Animal</Link>
                                </li>
                            </ul>
                            <button
                                    onClick={handleLogout}
                                    style={{marginLeft:50}} type="submit" className="btn btn-secondary">Logout</button>
                        </div>
                    </nav>

                    <main role="main" className="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                        <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">

                            <div>
                                <table className="table table-responsive">
                                    <tbody>
                                        <tr>
                                            <td><input className="form-control mr-sm-2" type="search" placeholder="User ID" onChange={e => setSearchId(e.target.value)}/> </td>
                                            <td><input className="form-control mr-sm-2" type="search" placeholder="First/Last Name" onChange={e => setName(e.target.value)}/></td>
                                            <td><button className="btn btn-primary" type="submit" onClick={handleSubmit}>Search</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <h1 style={{marginTop: 20,marginBottom: 20,fontSize:20}}><strong>Students</strong></h1>
                        <div className="table-responsive">
                            <table className="table table-responsive table-hover table-striped">
                                <thead>
                                    <tr>
                                    <th scope="col">User ID</th>
                                        <th scope="col">First Name</th>
                                        <th scope="col">Last Name</th>
                                        <th scope="col">Phone Number</th>
                                        <th scope="col">Date of Birth</th>
                                        <th scope="col">Email</th>
                                        <th scope="col">Sex</th>
                                        <th scope="col">Status</th>
                                        <th scope="col">Type</th>
                                        <th scope="col">Remove</th>
                                        <th scope="col">Block</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        myArray.map(myArray =>
                                            <tr key={myArray.userID}>
                                                <td>{myArray.username}</td>
                                                <td>{myArray.fname}</td>
                                                <td>{myArray.lname}</td>
                                                <td>{myArray.phoneNumber}</td>
                                                <td>{myArray.birthDate}</td>
                                                <td>{myArray.email}</td>
                                                <td>{myArray.sex}</td>
                                                <td>{myArray.status}</td>
                                                <td>{myArray.permission}</td>
                                                <th scope="col"><button className="btn btn-warning" href="#" 
                                                onClick={(e) => {removeStudent(e, myArray.username);}}
                                                ><i className="fa fa-minus-circle"></i></button></th>
                                                <th scope="col"><button className="btn btn-danger" href="#" 
                                                onClick={(e) => {blockStudent(e, myArray.username);}}
                                                ><i className="fa fa-times"></i></button></th>
                                            </tr>)
                                    }
                                </tbody>
                            </table>
                        </div>
                        <br />
                        <Link to={"/TeachingTechnicianAddUser"}> <button className="btn btn-primary" type="submit">Add Student</button></Link>
                    </main>
                </div>
            </div>
        </form >
    );
};
export default TeachingTechnicianStudentList;