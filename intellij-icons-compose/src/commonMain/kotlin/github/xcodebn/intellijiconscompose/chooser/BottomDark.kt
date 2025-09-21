package github.xcodebn.intellijiconscompose.chooser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BottomDark: ImageVector
    get() {
        if (_BottomDark != null) return _BottomDark!!

        _BottomDark = ImageVector.Builder(
            name = "BottomDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 2f)
                curveTo(8.45f, 2.00f, 8.75f, 2.30f, 8.75f, 2.76f)
                verticalLineTo(10f)
                lineTo(9f, 11f)
                lineTo(10f, 10f)
                lineTo(12f, 8f)
                curveTo(11.68f, 8.24f, 11.87f, 8.16f, 12.08f, 8.16f)
                curveTo(12.49f, 8.16f, 12.79f, 8.47f, 12.79f, 8.88f)
                curveTo(12.79f, 9.09f, 12.72f, 9.27f, 12.56f, 9.43f)
                lineTo(9f, 13f)
                curveTo(8.41f, 13.59f, 8.21f, 13.68f, 8.00f, 13.68f)
                curveTo(7.80f, 13.68f, 7.60f, 13.59f, 7.45f, 13.44f)
                lineTo(3f, 9f)
                curveTo(3.30f, 9.27f, 3.22f, 9.09f, 3.22f, 8.88f)
                curveTo(3.22f, 8.47f, 3.52f, 8.16f, 3.93f, 8.16f)
                curveTo(4.14f, 8.16f, 4.33f, 8.24f, 4.46f, 8.38f)
                lineTo(6f, 10f)
                lineTo(7f, 11f)
                lineTo(7f, 10f)
                verticalLineTo(3f)
                curveTo(7.26f, 2.30f, 7.56f, 2.00f, 8.00f, 2.00f)
                close()
            }
        }.build()

        return _BottomDark!!
    }

private var _BottomDark: ImageVector? = null

