using System;
using System.Collections.Generic;
using System.Text;
using decorator_practice.main.decorator;
using decorator_practice.main.users;
using Moq;
using NUnit.Framework;

namespace decorator_practice.test
{
    [TestFixture]
    class EditorUserTest
    {
        public Mock<User> user;
        public EditorUser eu;

        [SetUp]
        public void SetUp()
        {
            eu = new EditorUser();
            user = new Mock<User>(eu);
        }

        [TestCase]
        public void NameTest()
        {
            Assert.AreEqual("Editor", user.Object.getName());
        }
    }
}