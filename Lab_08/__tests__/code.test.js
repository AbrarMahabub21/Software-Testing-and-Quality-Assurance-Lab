// passwordChecker.js

function isPasswordValid(password) {
  // Password should not contain any space
  if (password.includes(" ")) {
    return false;
  }

  // Password should contain at least one digit(0-9)
  if (!/\d/.test(password)) {
    return false;
  }

  // Password length should be between 8 to 15 characters
  if (password.length < 8 || password.length > 15) {
    return false;
  }

  // Password should contain at least one lowercase letter(a-z)
  if (!/[a-z]/.test(password)) {
    return false;
  }

  // Password should contain at least one uppercase letter(A-Z)
  if (!/[A-Z]/.test(password)) {
    return false;
  }

  // Password should contain at least one special character ( @, #, %, &, !, $ )
  if (!/[@#%&!$]/.test(password)) {
    return false;
  }

  return true;
}

module.exports = isPasswordValid;
