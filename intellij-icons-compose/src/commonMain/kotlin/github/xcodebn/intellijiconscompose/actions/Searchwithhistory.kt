package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Searchwithhistory: ImageVector
    get() {
        if (_Searchwithhistory != null) return _Searchwithhistory!!

        _Searchwithhistory = ImageVector.Builder(
            name = "Searchwithhistory",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(9f, 10f)
                lineTo(12f, 13f)
                lineTo(11f, 14f)
                lineTo(8f, 11f)
                curveTo(7.15f, 11.63f, 6.12f, 12.00f, 5.00f, 12.00f)
                curveTo(2.24f, 12.00f, -0.00f, 9.76f, -0.00f, 7.00f)
                curveTo(-0.00f, 4.24f, 2.24f, 2.00f, 5.00f, 2.00f)
                curveTo(7.76f, 2.00f, 10.00f, 4.24f, 10.00f, 7.00f)
                curveTo(10.00f, 8.10f, 9.64f, 9.12f, 9.04f, 9.95f)
                close()
                moveTo(5f, 11f)
                curveTo(7.21f, 11.00f, 9.00f, 9.21f, 9.00f, 7.00f)
                curveTo(9.00f, 4.79f, 7.21f, 3.00f, 5.00f, 3.00f)
                curveTo(2.79f, 3.00f, 1.00f, 4.79f, 1.00f, 7.00f)
                curveTo(1.00f, 9.21f, 2.79f, 11.00f, 5.00f, 11.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(16f, 7f)
                lineTo(14f, 10f)
                lineTo(11f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91))
                ) {
                    moveTo(9f, 10f)
                    lineTo(12f, 13f)
                    lineTo(11f, 14f)
                    lineTo(8f, 11f)
                    curveTo(7.15f, 11.63f, 6.12f, 12.00f, 5.00f, 12.00f)
                    curveTo(2.24f, 12.00f, -0.00f, 9.76f, -0.00f, 7.00f)
                    curveTo(-0.00f, 4.24f, 2.24f, 2.00f, 5.00f, 2.00f)
                    curveTo(7.76f, 2.00f, 10.00f, 4.24f, 10.00f, 7.00f)
                    curveTo(10.00f, 8.10f, 9.64f, 9.12f, 9.04f, 9.95f)
                    close()
                    moveTo(5f, 11f)
                    curveTo(7.21f, 11.00f, 9.00f, 9.21f, 9.00f, 7.00f)
                    curveTo(9.00f, 4.79f, 7.21f, 3.00f, 5.00f, 3.00f)
                    curveTo(2.79f, 3.00f, 1.00f, 4.79f, 1.00f, 7.00f)
                    curveTo(1.00f, 9.21f, 2.79f, 11.00f, 5.00f, 11.00f)
                    close()
                }
            }
        }.build()

        return _Searchwithhistory!!
    }

private var _Searchwithhistory: ImageVector? = null

