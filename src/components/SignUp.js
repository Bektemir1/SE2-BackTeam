import React, { Component } from 'react'

import {
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBCard,
    MDBCardBody,
    MDBInput,
    MDBBtn,
   
    MDBModalFooter
} from 'mdbreact';


class SignUp extends Component {

    state={
        email:'',
        password:'',
        first_name:'',
        last_name:''
    }

    handleChange = (e) => {
        this.setState({
            [e.target.id]: e.target.value
        })
    }
    handleSubmit = (e) => {
        e.preventDefault();
      

               
    }

    render() {
        
        return (
           <MDBContainer className="signin">
      <MDBRow>
          <MDBCol md="3"></MDBCol>
        <MDBCol md="6">
    
          <MDBCard>
            <MDBCardBody className="mx-4">
              <div className="text-center">
                <h3 className="dark-grey-text mb-5">
                  <strong>Sign Up</strong>
                </h3>
              </div>
              <form onSubmit={this.handleSubmit}>
               < MDBInput
               onChange={this.handleChange}
               id="first_name"
               label = "First Name"
               group
               type = "text"
               validate
               error = "wrong"
               success = "right" /
                   >
                        < MDBInput
                            onChange={this.handleChange}
                        id="last_name"
                        label = "Last Name"
                        group
                        type = "text"
                        validate
                        error = "wrong"
                        success = "right" /
                            >
              <MDBInput
                  onChange={this.handleChange}
              id="email"
                label="Your email"
                group
                type="email"
                validate
                error="wrong"
                success="right"
              />
              <MDBInput
                  onChange={this.handleChange}
              id="password"
                label="Your password"
                group
                type="password"
                validate
                containerClass="mb-0"
              />
            
              <div className="text-center mb-3">
                <MDBBtn
                  type="submit"
                  gradient="blue"
                  rounded
                  className="btn-block z-depth-1a"
                >
                  Register
                </MDBBtn>
              </div>
              </form>
            </MDBCardBody>
            <MDBModalFooter className="mx-5 pt-3 mb-1">
              <p className="font-small grey-text d-flex justify-content-end">
                
                Already have an account? Log in
                <a href="signup" className="blue-text ml-1">
                    here
                  
                </a>
              </p>
            </MDBModalFooter>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>

        )
    }
}

export default SignUp
