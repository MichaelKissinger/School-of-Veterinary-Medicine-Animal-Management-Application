import React, { Component } from "react";

export default class UserProfile extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form className="user-profile">
                <header>
                    <div className="search-header-container blog-main-clear">
                        <div className="search-header-date-container">
                            <div className="header-date-inner">{this.state.date}</div>
                        </div>
                    </div>
                </header>
                <div className="profile-header alert alert-info">
                    <div className="profile-header-cover"></div>
                    <div className="profile-header-content">
                        <div className="profile-header-img mb-3">
                            <img src="https://www.bootdey.com/img/Content/avatar/avatar1.png" className="mb-4" className="" alt="" />
                        </div>
                        <div className="profile-header-info">
                            <h4 className="m-t-sm">General information</h4>
                            <p className="m-b-sm">First Name: <strong><i>John</i></strong></p>
                            <p className="m-b-sm">Last Name: <strong><i>Smith</i></strong></p>
                            <p className="m-b-sm">Birthday: <strong><i>1984-08-30</i></strong></p>
                            <p className="m-b-sm">Age: <strong><i>36</i></strong></p>
                            <p className="m-b-sm">Role: <strong><i>Manager</i></strong></p>
                        </div>
                    </div>
                </div>
                <div className="profile-search-container">
                <table className="table table-responsive">
                    <tbody>
                        <tr>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="ID" /></td>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="Name" /></td>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="Breed" /></td>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="Color" /></td>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="Birthday" /></td>
                            <td><input className="form-control mr-sm-2" type="search" placeholder="Owner" /></td>
                            <td><button className="btn btn-outline-primary" type="submit">Search</button></td>
                        </tr>
                    </tbody>
                </table>
                <table className="table table-responsive table-striped table-hover">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Type</th>
                            <th scope="col">Name</th>
                            <th scope="col">bread</th>
                            <th scope="col">Color</th>
                            <th scope="col">Birthday</th>
                            <th scope="col">Owner</th>
                            <th scope="col">Details</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>German Shepherd</td>
                            <td>Brown - Black</td>
                            <td>23-01-2018</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>Tibetan Mastiff</td>
                            <td>White</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Siberian Husky</td>
                            <td>Gray</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">4</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Siberian Husky</td>
                            <td>Khaki</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">5</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Siberian Husky</td>
                            <td>Gray</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">6</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>German Shepherd</td>
                            <td>Brown - Black</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                        <tr>
                            <th scope="row">7</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>Tibetan Mastiff</td>
                            <td>White</td>
                            <td>2018-11-10</td>
                            <td>The Owner</td>
                            <td><a className="fa fa-folder-open" href="#"></a></td>
                        </tr>
                    </tbody>
                </table>
                </div>
                <footer>
                    <div className="search-footer-container">
                    <p className="footer-address-inner">School of Veterinary Medicine 
                                            </p>
                    </div>
                </footer>
            </form >
        );
    }
}