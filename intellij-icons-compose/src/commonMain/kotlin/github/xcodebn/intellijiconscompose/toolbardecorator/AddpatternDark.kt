package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddpatternDark: ImageVector
    get() {
        if (_AddpatternDark != null) return _AddpatternDark!!

        _AddpatternDark = ImageVector.Builder(
            name = "AddpatternDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(13f, 16f)
                lineTo(14f, 16f)
                lineTo(14f, 15f)
                lineTo(13f, 15f)
                lineTo(13f, 16f)
                close()
                moveTo(14f, 8f)
                curveTo(12.12f, 8.50f, 11.00f, 9.62f, 11.00f, 11.00f)
                lineTo(12f, 11f)
                curveTo(12.25f, 10.31f, 12.81f, 9.75f, 13.50f, 9.75f)
                curveTo(14.19f, 9.75f, 14.75f, 10.31f, 14.75f, 11.00f)
                curveTo(14.75f, 12.25f, 12.88f, 12.09f, 12.88f, 14.12f)
                lineTo(14f, 14f)
                curveTo(14.12f, 12.72f, 16.00f, 12.56f, 16.00f, 11.00f)
                curveTo(16.00f, 9.62f, 14.88f, 8.50f, 13.50f, 8.50f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(13f, 16f)
                    lineTo(14f, 16f)
                    lineTo(14f, 15f)
                    lineTo(13f, 15f)
                    lineTo(13f, 16f)
                    close()
                    moveTo(14f, 8f)
                    curveTo(12.12f, 8.50f, 11.00f, 9.62f, 11.00f, 11.00f)
                    lineTo(12f, 11f)
                    curveTo(12.25f, 10.31f, 12.81f, 9.75f, 13.50f, 9.75f)
                    curveTo(14.19f, 9.75f, 14.75f, 10.31f, 14.75f, 11.00f)
                    curveTo(14.75f, 12.25f, 12.88f, 12.09f, 12.88f, 14.12f)
                    lineTo(14f, 14f)
                    curveTo(14.12f, 12.72f, 16.00f, 12.56f, 16.00f, 11.00f)
                    curveTo(16.00f, 9.62f, 14.88f, 8.50f, 13.50f, 8.50f)
                    close()
                }
            }
        }.build()

        return _AddpatternDark!!
    }

private var _AddpatternDark: ImageVector? = null

