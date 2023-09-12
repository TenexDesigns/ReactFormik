so in Yup, which  validations take  erros mesasages and which do not "Yup is a versatile schema validation library that can be used to validate a wide range of data types and structures. Here's a list of common items you can validate using Yup and how to use them:

1. **String Validation:**
   - `string()`: Validates that the value is a string.
   - Example: `Yup.string().required("Field is required")`

2. **Number Validation:**
   - `number()`: Validates that the value is a number.
   - Example: `Yup.number().required("Field is required")`

3. **Boolean Validation:**
   - `boolean()`: Validates that the value is a boolean.
   - Example: `Yup.boolean().required("Field is required")`

4. **Date Validation:**
   - `date()`: Validates that the value is a valid date.
   - Example: `Yup.date().required("Field is required")`

5. **Email Validation:**
   - `email()`: Validates that the value is a valid email address.
   - Example: `Yup.string().email("Invalid email syntax").required("Email is required")`

6. **Phone Number Validation:**
   - `matches(pattern, [message])`: Validates a string against a regular expression pattern.
   - Example for US phone numbers: `Yup.string().matches(/^\d{10}$/, "Invalid phone number").required("Phone is required")`

7. **URL Validation:**
   - `url()`: Validates that the value is a valid URL.
   - Example: `Yup.string().url("Invalid URL").required("URL is required")`

8. **Array Validation:**
   - `array()`: Validates that the value is an array.
   - Example: `Yup.array().of(Yup.number())`

9. **Object Validation:**
   - `object()`: Validates that the value is an object.
   - Example: `Yup.object().shape({ key: Yup.string() })`

10. **Mixed Data Types:**
    - You can use `mixed()` to create custom validation logic that doesn't fit neatly into the other types.
    - Example: `Yup.mixed().test("custom", "Invalid value", value => value !== "invalid")`

11. **Enum Validation:**
    - `oneOf([array], [message])`: Validates that the value is one of the values in the provided array.
    - Example: `Yup.string().oneOf(["option1", "option2"], "Invalid choice")`

12. **Required Fields:**
    - You can use `.required([message])` to specify that a field is required.
    - Example: `Yup.string().required("Field is required")`

Here's an example that combines some of these validation types:

```javascript
const validationSchema = Yup.object().shape({
  name: Yup.string().required("Name is required"),
  age: Yup.number().min(18, "Must be at least 18 years old").required("Age is required"),
  email: Yup.string().email("Invalid email syntax").required("Email is required"),
  birthDate: Yup.date().max(new Date(), "Birthdate must be in the past").required("Birthdate is required"),
  phoneNumber: Yup.string().matches(/^\d{10}$/, "Invalid phone number").required("Phone is required"),
  website: Yup.string().url("Invalid URL").required("Website URL is required"),
  isAdmin: Yup.boolean().required("Admin status is required"),
});
```

This example showcases the validation of various data types, including strings, numbers, dates, emails, phone numbers, URLs, and booleans. You can adjust the validation rules and error messages to suit your specific use case."






  
