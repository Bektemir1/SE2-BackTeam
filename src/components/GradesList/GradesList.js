import React, { Component } from 'react'
import {Link} from 'react-router-dom';
import HomeNavbar from "../HomeNavbar";
import Header from "../Header";

 class GradesList extends Component {
     render() {
         return (
             <div className="ar">
                 <div>
                     <Header/>

                 </div>
                 <div className="approveRegistration">

                     <div className="homeNavbar">

                         <HomeNavbar/>
                     </div>

                     <div className="Student">

                         <h2>Teachers Lessons</h2>
                         <table class="table table-bordered">
                             <thead className="thead-light">
                             <tr>
                                 <th>Course Id</th>
                                 <th>Course Name</th>
                                 <th>Teacher</th>
                                 <th>Credit</th>
                                 <th>Course</th>
                             </tr>
                             </thead>
                             <tbody>
                              <tr>
                                 <td>CS102</td>
                                  <td><Link to="courseRegistration">Programming Language 2</Link></td>
                                 <td>Burul Shambetova</td>
                                 <td>6</td>
                                 <td>Com-17</td>
                             </tr>

                             <tr>
                                 <td>CS 108</td>
                                 <td><Link to="courseRegistration">Engineering Computer Graphics</Link></td>
                                 <td>Burul Shambetova</td>
                                 <td>4</td>
                                 <td>COM-19</td>
                             </tr>
                             <tr>
                                 <td>CS202</td>
                                  <td><Link to="courseRegistration">Data Structure</Link></td>
                                 <td>Burul Shambetova</td>
                                 <td>4</td>
                                 <td>Com-18</td>
                             </tr>
                             </tbody>
                         </table>

                         <button className="btn btn-primary floar-right">Send approve</button>
                     </div>


                 </div>
             </div>
         )
     }
 }

export default GradesList


