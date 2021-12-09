import React, { Component } from "react";

export default class AdministratorAccess extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form className="admin-access-point">
                <header>
                    <div className="search-header-container blog-main-clear">
                        <div className="search-header-date-container">
                            <div className="header-date-inner">{this.state.date}</div>
                        </div>
                        <div className="sign-out">
                        <a className="sign-out fa fa-times" href="./Login" title="log out"></a>
                        </div>
                    </div>
                </header>
                <div className="admin-access-container row">
                    <div className="col-md-3">
                        <div className="card">
                            <h4 className="text-center bg-dark text-white-50">Administrator Access</h4>
                            <div className="card-body">
                                <div className="d-flex flex-column align-items-center text-center">
                                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="150" />
                                    <div className="mt-3">
                                        <table className="table table-responsive">
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Name:</th>
                                                    <th scope="col"><strong><i>John</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Family:</th>
                                                    <th scope="col"><strong><i>Smith</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Birtdate:</th>
                                                    <th scope="col"><strong><i>1984-08-30</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Type of Access:</th>
                                                    <th scope="col"><strong><i>Administrator</i></strong></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-3">
                        <div className="card">
                            <h4 className="text-center bg-dark text-white-50">Animals List</h4>
                            <div className="card-body">
                                <div className="d-flex flex-column align-items-center text-center">
                                    <div className="mt-3">
                                        <table className="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Name</th>
                                                    <th scope="col">Comment</th>
                                                    <th scope="col">Detail</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>

                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat A</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Kangaroo</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Dog B</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a className="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-5">
                        <div className="card">
                            <h4 className="text-center bg-dark text-white-50">User's List</h4>
                            <div className="card-body">
                                <div className="d-flex flex-column align-items-center text-center">
                                    <div className="mt-3">
                                    <button type="button" className="btn btn-outline-primary">Add User</button>
                                        <table className="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">First Name</th>
                                                    <th scope="col">Last Name</th>
                                                    <th scope="col">Edit</th>
                                                    <th scope="col">block</th>
                                                    {/* <th scope="col">Reset Password</th> */}
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">User Name</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Jim Carrey</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a className="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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