//a FileStream is created, but it is not disposed of.

using System;
using System.IO;
class Bad
{
    long GetLength(string file)
    {
        var stream = new FileStream(file, FileMode.Open);
        return stream.Length;
    }
}