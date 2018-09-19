# Demo 1.1

Build a container image using ENTRYPOINT and CMD.

```
docker build -t myls .
```

What is the difference between CMD and ENTRYPOINT.
CMD is used as Default and can be overwritten by first argument on `docker run`.
ENTRYPOINT can't be overwritten.
If ENTRYPOINT is missing you can run any arbitrary command which is available in the container image on `docker run`.

```
# Run with default CMD from Dockerfile
docker run --rm myls

# Run with argument
docker run --rm myls /usr
```