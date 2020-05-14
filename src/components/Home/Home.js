import React, { Component } from 'react';

import Header from '../Header';
import "./home.css";
import HomeNavbar from '../HomeNavbar';
import Dashboard from '../Dashboard';



class Home extends Component {

    render() {
        return (
            <div className="ar">
                <Header />

                <div className="approveRegistration">
                    <div className="homeNavbar"> <HomeNavbar /></div>
                    <div className="Student">
                        <Dashboard/>
                    </div>
                </div>


            </div>



        )
    }
}

export default Home
