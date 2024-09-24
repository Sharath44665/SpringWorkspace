# Service Layer

Separation of concerns is the key:

- **The controller (presentation layer, or port)** is a protocol interface which exposes application functionality as RESTful web services. It should do that and nothing more.
- **The repository (persistence layer, or adapter)** abstracts persistence operations: find (by id or other criteria), save (create, update) and delete records. It should do that and nothing more.
- **The service layer** (domain) contains your business logic. It defines which functionalities you provide, how they are accessed, and what to pass and get in return - **independent on any port (of which there may be multiple: web services, message queues, scheduled events) and independent on its internal workings** (it's nobody's business that the service uses the repository, or even how data is represented in a repository). The service layer may translate 1:1 from the repositiory data, or may apply filtering, transformation or aggregation of additional data.

The business logic may start simple at the beginning, and offer no more than simple CRUD operations, but that doesn't mean it will forever stay this way. As soon as you need to deal with access rights, it's no longer a matter of routing requests from the controller directly to the repository, but checking access and filtering data as well. Requests may need validation and consistency checks before hitting the database, rules and additional operations may be applied, so your **services get more value over time**.

Even for simple CRUD cases, I'd introduce a service layer, which at least translates from DTOs to Entities and vice versa.

**Keep your controllers/repositories (or ports and adapters) stupid, and your services smart, and you get a maintainable and well-testable solution**.

see codes in:
- StudentMapper
- StudentController

normally the code is cleaned in `StudentController`


