package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moveup: ImageVector
    get() {
        if (_Moveup != null) return _Moveup!!

        _Moveup = ImageVector.Builder(
            name = "Moveup",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                lineTo(14f, 11f)
                lineTo(2f, 11f)
                close()
            }
        }.build()

        return _Moveup!!
    }

private var _Moveup: ImageVector? = null

