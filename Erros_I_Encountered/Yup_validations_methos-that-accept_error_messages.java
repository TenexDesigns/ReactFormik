In Yup, error messages can be provided as the second argument to certain validation methods. Here's a breakdown of which validation methods accept error messages and which do not:

### Validation Methods That Accept Error Messages:

1. **`.required([message])`:** This method is used to specify that a field is required. You can provide a custom error message as the `message` argument. For example:
   ```javascript
   Yup.string().required("Field is required")
   ```

2. **`.email([message])`:** Used to validate that a value is a valid email address. You can provide a custom error message as the `message` argument. For example:
   ```javascript
   Yup.string().email("Invalid email syntax")
   ```

3. **`.matches(pattern, [message])`:** This method validates a string against a regular expression pattern. You can provide a custom error message as the `message` argument. For example:
   ```javascript
   Yup.string().matches(/^\d{10}$/, "Invalid phone number")
   ```

4. **`.url([message])`:** Used to validate that a value is a valid URL. You can provide a custom error message as the `message` argument. For example:
   ```javascript
   Yup.string().url("Invalid URL")
   ```

5. **`.oneOf(array, [message])`:** This method validates that a value is one of the values in the provided array. You can provide a custom error message as the `message` argument. For example:
   ```javascript
   Yup.string().oneOf(["option1", "option2"], "Invalid choice")
   ```

### Validation Methods That Do Not Accept Error Messages:

1. **`.string()`:** Validates that the value is a string. This method does not accept an error message as an argument.

2. **`.number()`:** Validates that the value is a number. This method does not accept an error message as an argument.

3. **`.boolean()`:** Validates that the value is a boolean. This method does not accept an error message as an argument.

4. **`.date()`:** Validates that the value is a valid date. This method does not accept an error message as an argument.

5. **`.array()`:** Validates that the value is an array. This method does not accept an error message as an argument.

6. **`.object()`:** Validates that the value is an object. This method does not accept an error message as an argument.

7. **`.mixed()`:** This method is used for custom validation logic that doesn't fit neatly into other types. You can use the `.test()` method to specify custom validation rules and error messages.

For most common validation scenarios, you can use the validation methods that accept error messages to provide meaningful error feedback to users. For more complex or custom validation, you can use the `.test()` method with a custom validation function to define your own error messages.
