package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDbObject: ImageVector
    get() {
        if (_DbDbObject != null) return _DbDbObject!!

        _DbDbObject = ImageVector.Builder(
            name = "DbDbObject",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 5f)
                curveTo(3.33f, 6.26f, 5.52f, 6.76f, 8.00f, 6.76f)
                curveTo(10.48f, 6.76f, 12.67f, 6.26f, 14.00f, 5.50f)
                curveTo(14.00f, 6.27f, 14.00f, 6.73f, 14.00f, 6.88f)
                curveTo(14.00f, 7.87f, 11.31f, 8.67f, 8.00f, 8.67f)
                curveTo(4.69f, 8.67f, 2.00f, 7.87f, 2.00f, 6.88f)
                curveTo(2.00f, 6.75f, 2.00f, 6.29f, 2.00f, 5.50f)
                close()
                moveTo(14f, 9f)
                curveTo(14.00f, 9.42f, 14.00f, 9.92f, 14.00f, 10.07f)
                curveTo(14.00f, 11.01f, 11.31f, 11.77f, 8.00f, 11.77f)
                curveTo(4.69f, 11.77f, 2.00f, 11.01f, 2.00f, 10.07f)
                curveTo(2.00f, 9.94f, 2.00f, 9.45f, 2.00f, 8.60f)
                curveTo(3.33f, 9.36f, 5.52f, 9.86f, 8.00f, 9.86f)
                curveTo(10.48f, 9.86f, 12.67f, 9.36f, 14.00f, 8.60f)
                close()
                moveTo(14f, 12f)
                lineTo(14f, 13f)
                curveTo(14.00f, 14.18f, 11.31f, 14.98f, 8.00f, 14.98f)
                curveTo(4.69f, 14.98f, 2.00f, 14.18f, 2.00f, 13.20f)
                lineTo(2f, 12f)
                curveTo(3.33f, 12.46f, 5.52f, 12.96f, 8.00f, 12.96f)
                curveTo(10.48f, 12.96f, 12.67f, 12.46f, 14.00f, 11.69f)
                close()
                moveTo(8f, 6f)
                curveTo(4.69f, 5.57f, 2.00f, 4.77f, 2.00f, 3.79f)
                curveTo(2.00f, 2.80f, 4.69f, 2.00f, 8.00f, 2.00f)
                curveTo(11.31f, 2.00f, 14.00f, 2.80f, 14.00f, 3.79f)
                curveTo(14.00f, 4.77f, 11.31f, 5.57f, 8.00f, 5.57f)
                close()
            }
        }.build()

        return _DbDbObject!!
    }

private var _DbDbObject: ImageVector? = null

