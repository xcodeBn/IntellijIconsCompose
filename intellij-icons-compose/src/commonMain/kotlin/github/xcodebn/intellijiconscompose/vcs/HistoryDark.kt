package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HistoryDark: ImageVector
    get() {
        if (_HistoryDark != null) return _HistoryDark!!

        _HistoryDark = ImageVector.Builder(
            name = "HistoryDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                curveTo(9.22f, 14.68f, 4.78f, 14.68f, 2.05f, 11.95f)
                curveTo(-0.68f, 9.22f, -0.68f, 4.78f, 2.05f, 2.05f)
                curveTo(4.78f, -0.68f, 9.22f, -0.68f, 11.95f, 2.05f)
                curveTo(14.68f, 4.78f, 14.68f, 9.22f, 11.95f, 11.95f)
                close()
                moveTo(7f, 12f)
                curveTo(9.87f, 12.20f, 12.20f, 9.87f, 12.20f, 7.00f)
                curveTo(12.20f, 4.13f, 9.87f, 1.80f, 7.00f, 1.80f)
                curveTo(4.13f, 1.80f, 1.80f, 4.13f, 1.80f, 7.00f)
                curveTo(1.80f, 9.87f, 4.13f, 12.20f, 7.00f, 12.20f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 12f)
                    curveTo(9.22f, 14.68f, 4.78f, 14.68f, 2.05f, 11.95f)
                    curveTo(-0.68f, 9.22f, -0.68f, 4.78f, 2.05f, 2.05f)
                    curveTo(4.78f, -0.68f, 9.22f, -0.68f, 11.95f, 2.05f)
                    curveTo(14.68f, 4.78f, 14.68f, 9.22f, 11.95f, 11.95f)
                    close()
                    moveTo(7f, 12f)
                    curveTo(9.87f, 12.20f, 12.20f, 9.87f, 12.20f, 7.00f)
                    curveTo(12.20f, 4.13f, 9.87f, 1.80f, 7.00f, 1.80f)
                    curveTo(4.13f, 1.80f, 1.80f, 4.13f, 1.80f, 7.00f)
                    curveTo(1.80f, 9.87f, 4.13f, 12.20f, 7.00f, 12.20f)
                    close()
                }
            }
        }.build()

        return _HistoryDark!!
    }

private var _HistoryDark: ImageVector? = null

