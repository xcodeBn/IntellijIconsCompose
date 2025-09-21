package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testroot: ImageVector
    get() {
        if (_Testroot != null) return _Testroot!!

        _Testroot = ImageVector.Builder(
            name = "Testroot",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.22f, 2.29f, 5.64f, 2.03f, 5.00f, 2.00f)
                lineTo(1f, 2f)
                lineTo(1f, 13f)
                close()
            }
        }.build()

        return _Testroot!!
    }

private var _Testroot: ImageVector? = null

