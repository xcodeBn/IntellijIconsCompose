package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DonemarkDark: ImageVector
    get() {
        if (_DonemarkDark != null) return _DonemarkDark!!

        _DonemarkDark = ImageVector.Builder(
            name = "DonemarkDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(12f, 16f)
                curveTo(14.43f, 16.00f, 16.00f, 14.43f, 16.00f, 12.50f)
                curveTo(16.00f, 10.57f, 14.43f, 9.00f, 12.50f, 9.00f)
                curveTo(10.57f, 9.00f, 9.00f, 10.57f, 9.00f, 12.50f)
                curveTo(9.00f, 14.43f, 10.57f, 16.00f, 12.50f, 16.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 12f)
                lineTo(12f, 13f)
                lineTo(14f, 11f)
                lineTo(15f, 12f)
                lineTo(12f, 14f)
                lineTo(10f, 12f)
                lineTo(11f, 12f)
                close()
            }
        }.build()

        return _DonemarkDark!!
    }

private var _DonemarkDark: ImageVector? = null

