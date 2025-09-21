package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Buttondroptriangle: ImageVector
    get() {
        if (_Buttondroptriangle != null) return _Buttondroptriangle!!

        _Buttondroptriangle = ImageVector.Builder(
            name = "Buttondroptriangle",
            defaultWidth = 8.0.dp,
            defaultHeight = 4.0.dp,
            viewportWidth = 8.0f,
            viewportHeight = 4.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                lineTo(8f, 4f)
                lineTo(0f, 4f)
                close()
            }
        }.build()

        return _Buttondroptriangle!!
    }

private var _Buttondroptriangle: ImageVector? = null

