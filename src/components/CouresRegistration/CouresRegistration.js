import React, { Component } from 'react'
import './CouresRegistration.css';
import Header from "../Header";
import HomeNavbar from "../HomeNavbar";


 class CouresRegistration extends Component {
     render() {
         return (
             <div>
                 <div>
                     <Header/>

                 </div>
                 <div className="approveRegistration">

                     <div className="homeNavbar">

                         <HomeNavbar/>
                     </div>

                     <div className="Student">

                         <h2>Students</h2>
                         <table class="table table-bordered">
                             <thead className="thead-light">
                             <tr>
                                 <th>№</th>
                                 <th>Name,Surname</th>
                                 <th>Mid</th>
                                 <th>Final</th>
                                 <th>Total</th>

                             </tr>
                             </thead>
                             <tbody>
                             <tr>
                                 <td>1</td>
                                 <td>Rapkat</td>
                                 <td>100</td>
                                 <td>100</td>
                                 <td>100</td>


                             </tr>
                             <tr>
                                 <td>2</td>
                                 <td>Damir</td>
                                 <td>100</td>
                                 <td>100</td>
                                 <td>100</td>

                             </tr>
                             <tr>
                                 <td>3</td>
                                 <td>Bektemir</td>
                                 <td>100</td>
                                 <td>100</td>
                                 <td>100</td>

                             </tr>
                             </tbody>
                         </table>

                         <button className="btn btn-primary floar-right">Change</button>
                         <button className="btn btn-primary floar-right">Done</button>
                     </div>


                 </div>
             </div>

        )
    }
}

export default CouresRegistration
