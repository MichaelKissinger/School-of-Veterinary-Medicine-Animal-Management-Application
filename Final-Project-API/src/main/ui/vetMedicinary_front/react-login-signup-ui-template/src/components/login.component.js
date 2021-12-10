import React, { Component } from "react";
import axios from 'axios';

export default class Login extends Component {


    handleSubmit = e => {
        e.preventDefault();
        const sendData = {
            name: this.name,
            password: this.password,
        }
        axios.post(this.state.REST_API_LOGIN, sendData)
        .then(res=>console.log(res))
        .then(res=>console.log(res.data))
            // .then(res => { localStorage.setItem('username', res.data.username); })
            // .then(res => { localStorage.setItem('LName', res.data.lastName); })
            // .then(res => { localStorage.setItem('FName', res.data.FName); })
            // .then(res => { localStorage.setItem('permission', res.data.permission); })
            // .then(console.log(localStorage.getItem('LName')))
            // .then(console.log(localStorage.getItem('username')))
            // .then(console.log(localStorage.getItem('permission')))
            // .then(console.log(localStorage.getItem('FName')))
            .catch(err => {
                console.log(err);
            })
        // switch (localStorage.getItem('permission')) {
        //     case 'Admin':
        //         console.log("Admin");
        //         this.props.history.push('/AdminAnimalSearch');
        //         break;
        //     case 'Teacher':
        //         console.log('Teacher');
        //         this.props.history.push('/TeachingTechnicianAnimalSearch');
        //         break;
        //     case 'Care':
        //         console.log("Care");
        //         this.props.history.push('/AnimalCareAttendanceAnimalSearch');
        //         break;
        //     case 'Health':
        //         console.log("Health");
        //         this.props.history.push('/AnimalHealthTechnicianAnimalSearch');
        //         break;
        //     case 'Student':
        //         console.log("Student");
        //         this.props.history.push('/StudentAnimalSearch');
        //         break;
        //     default:
        //         console.log("User not found");
        // }

    }
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString(),
            REST_API_LOGIN: "http://localhost:8080//login",
        };
    }
    render() {
        return (
            <div className="login">
                <header>
                    <div className="header-container blog-main-clear">
                        <div className="header-date-container">
                            <div className="header-date-inner">{this.state.date}</div>
                        </div>
                        <div className="header-logo-container">
                            <div className="header-logo-inner"></div>
                        </div>
                    </div>
                </header>
                <div className="body-container">
                    <form onSubmit={this.handleSubmit}>
                        <div className="login-signup-inner">
                            <h3 id="form-title">Sign In</h3>
                            <div className="login-input-container form-group">
                                <label>User ID</label>
                                <input type="text"
                                    onChange={e => this.name = e.target.value}
                                    className="form-control" placeholder="Enter ID" />
                            </div>
                            <div className="login-input-container form-group">
                                <label>Password</label>
                                <input type="password"
                                    onChange={e => this.password = e.target.value}
                                    className="form-control" placeholder="Enter password" />
                            </div>
                            <button type="submit" className="login-btn btn btn-danger btn-block">SIGN IN</button>
                        </div>
                    </form>
                </div>

                <footer>
                    <div className="search-footer-container">
                        <p className="footer-address-inner">School of Veterinary Medicine
                            <br />
                            2500 University Drive NW
                            <br />
                            Calgary Alberta Canada</p>
                    </div>
                </footer>
            </div>
        );
    }
}
