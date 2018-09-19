# Demo 1.2

Running processes in Docker and PID 1

```
docker build -t myapp .
```

```
# Run java binary with default "-h"
docker run --rm -t myapp

# Run java application called Main
docker run --rm -t myapp Main

# Run with Docker built-in init
docker run --init --rm -t myapp Main
```
