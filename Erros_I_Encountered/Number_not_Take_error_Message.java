The error you are encountering, "schema[(intermediate value)(intermediate value)(intermediate value)] is not a function," is likely caused by the way you have defined the validation schema for your Formik form.

In your code, you have defined the `phone` field with `Yup.number("Invalid phone number")`. However, the `Yup.number()` function does not take an error message as an argument. The correct way to define a number field with an error message is to use `.typeError("Invalid phone number")`.

Here's the corrected validation schema:

```javascript
const validationSchema = {
  userName: Yup.string().required("Field is required"),
  email: Yup.string().email("Invalid email syntax").required("Email is required"),
  phone: Yup.number().typeError("Invalid phone number").required("Phone is required"),
};
```

Make sure to replace the `validationSchema` in your code with the corrected schema as shown above. This should resolve the error and properly validate the phone number field.
