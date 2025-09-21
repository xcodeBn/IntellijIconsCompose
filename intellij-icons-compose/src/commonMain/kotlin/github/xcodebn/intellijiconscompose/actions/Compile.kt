package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Compile: ImageVector
    get() {
        if (_Compile != null) return _Compile!!

        _Compile = ImageVector.Builder(
            name = "Compile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                lineTo(12f, 1f)
                lineTo(14f, 3f)
                lineTo(13f, 4f)
                lineTo(12f, 3f)
                lineTo(10f, 3f)
                lineTo(10f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 16f)
                lineTo(7f, 16f)
                lineTo(7f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 3f)
                lineTo(7f, 4f)
                lineTo(6f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 1f)
                lineTo(6f, 1f)
                lineTo(7f, 1f)
                curveTo(6.88f, 0.81f, 7.03f, 0.72f, 7.21f, 0.72f)
                lineTo(11f, 1f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _Compile!!
    }

private var _Compile: ImageVector? = null

