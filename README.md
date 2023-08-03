## Running the example

To run the example, you need to have a working installation of [Docker](https://www.docker.com/) and docker-compose.

By default, the example creates a `/tmp/test-data` directory and an empty file within it.

Change the value of `data_dir` in `src/main/application.yaml` to change that location.

Camel will create a route that reads from `data_dir` and sends files to an AWS S3 bucket.
By default, this example will upload files to an S3 bucket named `my-data` in localstack.


The route is defined using the YAML DSL in `src/main/resources/routes/upload-route.yaml`.

