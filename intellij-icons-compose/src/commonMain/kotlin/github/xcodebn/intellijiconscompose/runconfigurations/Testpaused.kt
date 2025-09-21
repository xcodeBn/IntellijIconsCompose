package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testpaused: ImageVector
    get() {
        if (_Testpaused != null) return _Testpaused!!

        _Testpaused = ImageVector.Builder(
            name = "Testpaused",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 11f)
                lineTo(7f, 11f)
                lineTo(7f, 5f)
                lineTo(5f, 5f)
                close()
                moveTo(9f, 5f)
                lineTo(9f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 5f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _Testpaused!!
    }

private var _Testpaused: ImageVector? = null

