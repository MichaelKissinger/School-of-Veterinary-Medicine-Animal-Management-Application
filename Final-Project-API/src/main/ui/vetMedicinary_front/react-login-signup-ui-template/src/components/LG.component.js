import React, { Component } from "react";
import axios from 'axios';

export default class Login extends Component {
   
    

    handleSubmit = e=>{
        e.preventDefault();
 
        const data = {
            name : this.name,
            password : this.password,
        }

        console.log(this.name, this.password);
        console.log(typeof(this.name));
        axios.put(this.state.REST_API_LOGIN,data)
        // .then(res=>{localStorage.setItem('token',res.data.token)})
        .then(res=>{console.log(res)})
        .catch(err=>{
         console.log(err);
        })
    }
    constructor(props) {
        super(props);
        this.state = {
          date: new Date().toLocaleString(),
          REST_API_LOGIN : "http:/localhost:8080/Login",
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
                                <label>Name</label>
                                <input type="text"
                                onChange={e=>this.name=e.target.value}
                                 className="form-control" placeholder="Enter Name" />
                            </div>
                            <div className="login-input-container form-group">
                                <label>Password</label>
                                <input type="password" 
                                onChange={e=>this.password=e.target.value}
                                className="form-control" placeholder="Enter password" />
                            </div>
                            <button type="submit" className="login-btn btn btn-danger btn-block">SIGN IN</button>
                        </div>
                    </form>
                </div>

                <footer>
                    <div className="search-footer-container">
                    <p className="footer-address-inner">School of Veterinary Medicine 
                                                    <br/>
                                                    2500 University Drive NW
                                                    <br/>
                                                    Calgary Alberta Canada</p>
                    </div>
                </footer>

            </div>
        );
    }
}

// import axios from 'axios';
// import React, { useState } from "react";

// const Login = () => {

//     const REST_API_ANIMAL="http://localhost:8080//allAnimals";
//     const REST_API_LOGIN = "http://localhost:8080//login";

//     const [output, setOutput] = React.useState([]);
//     const [result, setResult] = React.useState([]);
//     const date = new Date().toLocaleString();
//     const [name, setName] = useState("");
//     const [password, setPassword] = useState("");

//     function login() {
//         console.log(name, password);
//     }
//     React.useEffect(() => {
//         // axios.get(REST_API_ANIMAL).then(response => setResult(response.data));
//         // axios.get(REST_API_LOGIN).then(response => setOutput(response.data));

//     }, []);
//     return (
//         <div className="login">
//             <header>
//                 <div className="header-container blog-main-clear">
//                     <div className="header-date-container">
//                         <div className="header-date-inner">{date}</div>
//                     </div>
//                     <div className="header-logo-container">
//                         <div className="header-logo-inner"></div>
//                     </div>
//                 </div>
//             </header>
//             <div className="body-container">
//                 <form>
//                     <div className="login-signup-inner">
//                         <h3 id="form-title">Sign In</h3>
//                         <div className="login-input-container form-group">
//                             <label>Name</label>
//                             <input type="text"
//                                 onChange={(e) => setName(e.target.value)}
//                                 className="form-control" placeholder="name" />
//                         </div>
//                         <div className="login-input-container form-group">
//                             <label>Password</label>
//                             <input type="password"
//                                 onChange={(e) => setPassword(e.target.value)}
//                                 className="form-control" placeholder="password" />
//                         </div>
//                         <button
//                             onClick={login}
//                             type="submit" className="login-btn btn btn-danger btn-block">SIGN IN</button>
//                     </div>
//                 </form>
//             </div>
//             <div className="APIResult">   <table class="table">
//                 <thead>
//                     <tr>
//                         <th>Animal ID</th>
//                         <th>Breed</th>
//                     </tr>
//                 </thead>
//                 <tbody>
//                     {
//                         result.map(result =>
//                             <tr key={result.id}>
//                                 <td>{result.animalId}</td>
//                                 <td>{result.breed}</td>
//                             </tr>)
//                     }
//                 </tbody>
//                 <div>{output}</div>
//             </table> </div>
//             <footer>
//                 <div className="search-footer-container">
//                     <p className="footer-address-inner">School of Veterinary Medicine
//                         <br />
//                         2500 University Drive NW
//                         <br />
//                         Calgary Alberta Canada</p>
//                 </div>
//             </footer>
//         </div>
//     );
// };

// export default Login;