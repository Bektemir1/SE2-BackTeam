import React, { Component } from 'react'
import logo from '../logo.png';

import {
    MDBContainer,
    MDBNavbar, MDBNavbarBrand, MDBNavbarNav, MDBNavItem, MDBNavLink,MDBNavbarToggler, MDBCollapse

} from "mdbreact";

class Navbar extends Component {
    state = {
        isOpen: false
    };

    toggleCollapse = () => {
        this.setState({ isOpen: !this.state.isOpen });
    }


    render() {
        return (
            <MDBNavbar className="navbar" dark expand="md">
                <MDBContainer>
                    <MDBNavbarBrand>
                        <strong className="white-text"><img className="navbar-logo" alt="logo" src={logo} /> Ala-Too</strong>
                        </MDBNavbarBrand>
                    <MDBNavbarToggler onClick={this.toggleCollapse} />
                    <MDBCollapse id="navbarCollapse3" isOpen={this.state.isOpen} navbar>
                        <MDBNavbarNav right>
                            <MDBNavItem>
                                <MDBNavLink to="signin">SignIn</MDBNavLink>
                            </MDBNavItem>
                           <MDBNavItem>
                                <MDBNavLink to="signup">SignUp</MDBNavLink>
                            </MDBNavItem>
                              <MDBNavItem>
                                <MDBNavLink to="home">BK</MDBNavLink>
                            </MDBNavItem>
                          
                        </MDBNavbarNav>
                    </MDBCollapse>
                </MDBContainer>
            </MDBNavbar>
        )
    }
}


export default Navbar
