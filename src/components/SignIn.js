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





class SignIn extends Component {
    state = {
        email: '',
        password: ''
    }
    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        })
    }
    handleSubmit = (e) => {
        e.preventDefault();

    
        this.props.signIn(this.state)
      
    }
    render() {
        return (
<MDBContainer className="signin">
      <MDBRow>
          <MDBCol md="3"></MDBCol>
        <MDBCol md="6">
            <div className="text-center">
            
            </div>
          <MDBCard>
            <MDBCardBody className="mx-4">
              <div className="text-center">
                <h3 className="dark-grey-text mb-5">
                  <strong>Sign in</strong>
                </h3>
              </div>
              <form onSubmit={this.handleSubmit}>
              <MDBInput
              name="email"
                label="Your email"
                group
                type="email"
                noValidate
                error="wrong"
                success="right"
                onChange={this.handleChange}
               
              />
              <MDBInput
                label="Your password"
                group
                type="password"
                noValidate
                containerClass="mb-0"
                  onChange={this.handleChange}
                name="password"
              />
              <p className="font-small blue-text d-flex justify-content-end pb-3">
                Forgot
                <a href="#!" className="blue-text ml-1">

                  Password?
                </a>
              </p>
              <div className="text-center mb-3">
                <MDBBtn
                  type="submit"
                  gradient="blue"
                  rounded
                  className="btn-block z-depth-1a"
                >
                  Sign in
                </MDBBtn>
              </div>
              </form>
              
            </MDBCardBody>
            <MDBModalFooter className="mx-5 pt-3 mb-1">
              <p className="font-small grey-text d-flex justify-content-end">
                Not a member?
                <a href="signup" className="blue-text ml-1">

                  Sign Up
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



export default SignIn;
