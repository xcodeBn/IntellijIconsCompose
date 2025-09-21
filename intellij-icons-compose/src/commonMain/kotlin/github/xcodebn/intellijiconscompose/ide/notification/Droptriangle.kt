package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Droptriangle: ImageVector
    get() {
        if (_Droptriangle != null) return _Droptriangle!!

        _Droptriangle = ImageVector.Builder(
            name = "Droptriangle",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                lineTo(12f, 10f)
                lineTo(4f, 10f)
                close()
            }
        }.build()

        return _Droptriangle!!
    }

private var _Droptriangle: ImageVector? = null

