import React, { Component } from 'react'
import './HomeNavbar.css';
import {Link} from 'react-router-dom';

class HomeNavbar extends Component {
    render() {
        return (
            <div>
                <div class=" border-right" id="sidebar-wrapper">
                    <div class="list-group list-group-flush">
                        <Link to="home" class="list-group-item list-group-item-action ">Home Page</Link>
                        <Link to="gradeList" class="list-group-item list-group-item-action ">Teachers Lesson</Link>
                        <Link to="approveRegistration" class="list-group-item list-group-item-action "> Approve registration </Link>
                        <Link to="listOfStudent" class="list-group-item list-group-item-action ">List of student</Link>

                    </div>
                </div>

            </div>
        )
    }
}

export default HomeNavbar
