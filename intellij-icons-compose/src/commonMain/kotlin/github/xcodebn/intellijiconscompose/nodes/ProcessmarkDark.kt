package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProcessmarkDark: ImageVector
    get() {
        if (_ProcessmarkDark != null) return _ProcessmarkDark!!

        _ProcessmarkDark = ImageVector.Builder(
            name = "ProcessmarkDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
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
                moveTo(12f, 10f)
                lineTo(15f, 12f)
                lineTo(12f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _ProcessmarkDark!!
    }

private var _ProcessmarkDark: ImageVector? = null

