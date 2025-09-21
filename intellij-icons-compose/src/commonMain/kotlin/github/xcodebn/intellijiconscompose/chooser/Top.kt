package github.xcodebn.intellijiconscompose.chooser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Top: ImageVector
    get() {
        if (_Top != null) return _Top!!

        _Top = ImageVector.Builder(
            name = "Top",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 14f)
                curveTo(8.45f, 13.68f, 8.75f, 13.38f, 8.75f, 12.92f)
                verticalLineTo(6f)
                lineTo(9f, 4f)
                lineTo(10f, 6f)
                lineTo(12f, 7f)
                curveTo(11.68f, 7.44f, 11.87f, 7.52f, 12.08f, 7.52f)
                curveTo(12.49f, 7.52f, 12.79f, 7.21f, 12.79f, 6.80f)
                curveTo(12.79f, 6.59f, 12.72f, 6.41f, 12.56f, 6.25f)
                lineTo(9f, 2f)
                curveTo(8.41f, 2.09f, 8.21f, 2.00f, 8.00f, 2.00f)
                curveTo(7.80f, 2.00f, 7.60f, 2.09f, 7.45f, 2.24f)
                lineTo(3f, 6f)
                curveTo(3.30f, 6.41f, 3.22f, 6.59f, 3.22f, 6.80f)
                curveTo(3.22f, 7.21f, 3.52f, 7.52f, 3.93f, 7.52f)
                curveTo(4.14f, 7.52f, 4.33f, 7.44f, 4.46f, 7.30f)
                lineTo(6f, 6f)
                lineTo(7f, 4f)
                lineTo(7f, 6f)
                verticalLineTo(13f)
                curveTo(7.26f, 13.38f, 7.56f, 13.68f, 8.00f, 13.68f)
                close()
            }
        }.build()

        return _Top!!
    }

private var _Top: ImageVector? = null

