package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Uplevel: ImageVector
    get() {
        if (_Uplevel != null) return _Uplevel!!

        _Uplevel = ImageVector.Builder(
            name = "Uplevel",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 8f)
                lineTo(8f, 2f)
                lineTo(2f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 14f)
                lineTo(10f, 14f)
                lineTo(10f, 8f)
                close()
            }
        }.build()

        return _Uplevel!!
    }

private var _Uplevel: ImageVector? = null

